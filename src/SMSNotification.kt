class SMSNotification (
    private val phoneNumber: String
): NotificationAction{

    override fun sendNotification(msg: String) {
        println("Nomor HP anda: $phoneNumber")
        println(" $msg")
    }
}