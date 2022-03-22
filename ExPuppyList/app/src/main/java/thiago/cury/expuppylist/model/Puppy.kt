package thiago.cury.expuppylist.model

data class Puppy(
    val id: Int,
    val title: String,
    val sex: String,
    val age: Int,
    val description: String,
    val puppyImageId: Int = 0
) {

    fun calculateAge(): Int {
        return age * 7
    }

    override fun toString(): String {
        return "Puppy(id=$id, title='$title', sex='$sex', age=$age, description='$description', puppyImageId=$puppyImageId)"
    }
}