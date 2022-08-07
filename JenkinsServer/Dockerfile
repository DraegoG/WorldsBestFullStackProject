FROM jenkins/jenkins:lts-jdk11
USER root

# Install the latest Docker CE binaries
RUN export http_proxy=http://web-proxy.us.softwaregrp.net:8080
RUN export https_proxy=http://web-proxy.us.softwaregrp.net:8080
RUn curl https://get.docker.com/ | sh