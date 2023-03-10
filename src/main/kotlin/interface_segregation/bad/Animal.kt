package interface_segregation.bad

interface Animal {
    fun nameOfAnimal(): String?
    fun walk(): String?
    fun fly(): String?
    fun swim(): String?
    fun bark(): String?
    fun quack(): String?
    fun meow(): String?
}