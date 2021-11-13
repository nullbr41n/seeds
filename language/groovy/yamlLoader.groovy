/*
Sample snippet to read yamlfile in groovy language
*/

@Grab('org.yaml:snakeyaml:1.17')
import org.yaml.snakeyaml.Yaml


// Reading yaml file from workspace
String content = readFileFromWorkspace("path/myYamlFile.yaml")
//writing content of yaml into new file
def myFile = new File('/tmp/mySuperFile.yaml')
//Commit
myFile.write(content)

// read all the content of the file into a single string
File fh1 = new File(filename)
text = fh1.getText('UTF-8')

println(text)
