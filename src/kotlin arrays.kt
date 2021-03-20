import java.util.*
fun main(){
    var nameArray=arrayOf("Melannie","Winnie","Allen","Samba")
    println(Arrays.toString(nameArray))
    world()
    num()
    var name=names("Lavington","Belyse","Jackie")
    println(Arrays.toString(name))

}
fun world(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    for (city in cities){
        println(city.capitalize())
    }
}
fun num(){
    var numbers=arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var total=numbers[1].plus(numbers[4])
    println(total)
    println(numbers.indexOf(158))
    var sortedNumbers=numbers.sortedArray()
    println(Arrays.toString(sortedNumbers))
    
}
fun names(a:String,b:String,c:String):Array<String>{
    var name= arrayOf(a,b,c)
    return name
}