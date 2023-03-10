package interface_segregation.bad

class Cat : Animal {
    override fun nameOfAnimal(): String {
        return "cat"
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

    override fun bark(): String? {
        return null
    }

    override fun quack(): String? {
        return null
    }

    override fun meow(): String {
        return "meow!"
    }
}