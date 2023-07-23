#create docker image with tag #java-docker 
	
docker build --tag java-docker . 


#run docker app tag "java-docker" 
#localhost:8080 (spring default port) mapped with port 8090 of the image runner

docker run -p 127.0.0.1:8080:8090/TCP java-docker 

#push on azure :
- Prerequisites :
  - Docker and Azure App Service extensions 
  - instance of Azure Container Registry (ACR)

- Step:
        - Open the Docker Explorer and select Connect Registry.
        - Tag the image :   <your registry or username>/<image name>:<tag> (webapp6.azurecr.io/webapp6:latest)
        - Push image to registry.
        - Click on Deploy Image To Azure App Service
