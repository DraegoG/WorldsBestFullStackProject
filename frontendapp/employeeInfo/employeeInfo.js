function giveEmployeeDetails() {
    console.log("working!!");
    var backendUrl = window.location.protocol+'//'+ window.location.hostname + ':8888/employees';
    console.log(backendUrl);
    fetch(backendUrl)
    .then( response => {
        return response.json();
    })
    .then( users => {
        console.log(users);
        document.getElementById("empName").innerHTML = users.name;
        document.getElementById("empEmail").innerHTML = users.email;
    });
}