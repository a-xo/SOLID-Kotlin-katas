package interface_segregation.bad

class Dog : Animal {
    override fun nameOfAnimal(): String {
        return "dog"
    }

    override fun walk(): String {
        return "the " + nameOfAnimal() + " is walking!"
    }

    override fun fly(): String? {
        return null
    }

    override fun swim(): String? {
        return null
    }

    override fun bark(): String {
        return "woof!"
    }

    override fun quack(): String? {
        return null
    }

    override fun meow(): String? {
        return null
    }
}