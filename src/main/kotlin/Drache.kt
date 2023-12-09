class Drache( name: String,  hp: Int): Gegner(name, hp, hp) {
    var attacDamage = 50
    var healAmount = 50
    var attacDamage2 = 100
    var feueratemDamage = 20


    override fun performAction(action: String, target: Held) {
        when (action) {
            "Feuer Ball" -> target.takeDamage(attacDamage)
            "Fluegelschlag" -> target.takeDamage(attacDamage2)
            "Feueratem" -> this.takeDamage(feueratemDamage)
            "Heilender Feuer Stein" -> this.heal(healAmount)
            "Fluch"-> target.fluch()
            else -> super.performAction(action, target)
        }
    }





}