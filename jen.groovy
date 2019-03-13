
import hudson.model.Node;
import hudson.model.Slave;
import jenkins.model.Jenkins;

Jenkins jenkins = Jenkins.instance;
def nodes = jenkins.nodes;

for (Node node in nodes) {
    println "node found";
}
