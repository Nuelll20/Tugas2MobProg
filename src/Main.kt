fun main() {
    println("Simulasi Sistem Notifikasi Aplikasi Mobile")

    val emailService: NotificationAction =
        EmailNotification("mahasiswa.informatika@univ.ac.id")
    emailService.sendNotification("Kode OTP verifikasi aplikasi mobile: 1234")

    val pushService: NotificationAction =
        PushNotification("fcm_token_xyz123_android_phone")
    pushService.sendNotification("Diskon 50% khusus pengguna baru hari ini! Klik di sini.")

    val smsService: NotificationAction =
        SMSNotification("081234567898")
    smsService.sendNotification("Pulsa Anda hampir habis!")
}