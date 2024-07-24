package Collections

fun main(){
    val lists = listOf<Any>("name",123,true,false,4.5,"some",'a','d',1,4,5)
    println(getSpecificType<String>(lists))
}

// make function inline with reified to make T to runtime [if(item is T)]
// if T is not runtime, compiler will erase at compile time
inline fun<reified T> getSpecificType(list: List<Any>):List<T>{
    val specificList = mutableListOf<T>()

    for (item:Any in list){
        if(item is T){
            specificList.add(item)
        }
    }
    return  specificList
}