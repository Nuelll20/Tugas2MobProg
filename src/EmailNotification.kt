class EmailNotification (
    private val emailAddress: String
): NotificationAction{

    override fun sendNotification (msg: String){
        println("Email [$emailAddress]")
        println(" $msg")
    }
}