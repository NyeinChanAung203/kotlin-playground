package Collections


fun main(){
    val laptops = listOf(
        Laptop("Dell",2012,8,400),
        Laptop("Apple",2018,8,1000),
        Laptop("Hp",2022,12,800),
        Laptop("Acer",2020,4,200),
        Laptop("Lenovo",2018,16,600),
    )

    laptops.sortedBy { -it.price }.forEach({ println(it) })
    println()

    // sorted is cuz Comparable
    laptops.sorted().forEach { println(it) }
    println()


    //
    laptops.sortedWith(ComparatorRam()).forEach { println(it) }
    println()

    laptops.sortedWith(compareBy{ it.year }).forEach { println(it) }
    println()


    laptops.sortedBy { it.name }.forEach { println(it) }
}

data class Laptop(val name:String,val year: Int,val ram:Int,val price:Int) :Comparable<Laptop>{
    override fun compareTo(other: Laptop): Int {
        return if(this.price > other.price){
            1
        }else if(this.price < other.price){
            -1
        }else {
            0
        }
    }
}


class ComparatorRam: Comparator<Laptop>{
    override fun compare(o1: Laptop, o2: Laptop): Int {
        return if(o1.ram > o2.ram){
            1
        }else if(o1.ram < o2.ram){
            -1
        }else {
            0
        }
    }

}