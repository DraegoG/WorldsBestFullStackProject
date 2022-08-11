# WorldsBestFullStackProject
This is actually a practice project to learn:
1. Creating a simple website with a frontend in HTML and JS and having a backend in Java-springboot
2. Learn how a jenkins pipeline works - creating docker images for frontend and backned using jenkins pipeline
3. How we can create a jenkins pipeline - to create EC2 instances in an AWS infra using AWS CLI, deploy the docker images in the EC2 setups -> in this way we will be having the website deployed in AWS

Steps:
1. Create a simple website with frontend on HTML and JS + backend in Java-Springboot
2. Try deploying the website in your local setup
3. Dockerrize your both applications(frontend and backend)
4. Install Jenkins + docker + dockercompose in one of the setups
5. Create jenkins pipeline for CI(on triggering the pipeline it will trigger docker build and create a docker image for the frontend and backend apps) and CD(on triggering the pipeline it will deploy the docker images int he EC2 instances)
