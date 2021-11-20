Q: How to run debug alpine image in k8s to debug?
## kubectl
`kubectl run -i --tty --rm debug --image=alpine --restart=Never -- sh`

Q: How to install package on alpine docker image with package manager apk?
## install packages to 
`apk add gcc musl-dev python3-dev libffi-dev openssl-dev cargo`


Q: How to install python3 pip / pip3 in Alpine Linux Docker image?
## Install pip2
`apk add py3-pip`


Q: How to pip3 install packages?
## install required packages

* Specific packages
`pip3 install boto3 requests cryptography pyaml`

* or all required
`pip3 install -r requirements`
