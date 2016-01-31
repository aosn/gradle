import java.sql.Timestamp

def date = new Date()
Timestamp ts = new Timestamp(date.getTime())

println ts
def scriptScope = 'SCRIPT'

task getMessage << {
    def taskScope = 'TASK'
    if(taskScope){
      def localScpoe = 'LOCAL'
      println scriptScope + ';' +taskScope +':'+ localScpoe
    }
}

println scriptScope
println taskScope
println localScpoe
