# Dicoding_Lesson3

### Fragment

Fragment adalah sebuah sub-bagian yang mewakili perilaku tertentu pada UI dalam sebuah aktivitas. Utamanya Fragment digunakan dalam UI yang memiliki banyak layar (multi-pane UI).
   * Dalam sebuah activity, bisa terdapat satu atau lebih fragment.
   * Fragment bisa digunakan kembali (reuseable) sehingga mengurangi kompleksitas kode.
   * Bisa dikatakan Fragment adalah sub-activity yang memiliki input, output, behavior, dan lifecyclesendiri.
 

### Mengapa Fragment?

Fragment diperkenalkan Google pada API 11 (Android 3.0 Honeycomb), untuk menangani tampilan desain yang dinamis dan variatif karena adanya tambahan kategori device, yakni tablet.
   * Ukuran layar pada tablet lebih besar daripada handset pada umumnya, sehingga banyak aspek UI yang seharusnya dapat dikombinasikan dan diatur berbeda daripada UI pada handset.
   * Contohnya, adalah aplikasi Whatsapp dimana terdapat 3 tab : Call, Chat dan Contacts. Untuk membuat tampilan seperti itu kita menggunakan fragment sebagai isi dari content tabnya dengan dibungkus oleh ViewPager dan dengan TabLayout sebagai tab indicator-nya.


### Ilustrasi

Ilustrasi bagaimana Fragment membuat perbedaan pada multi-pane UI. Pada tampilan kiri (tablet), dua Fragment bisa dijadikan satu dalam satu layar, sementara pada handset yang ukuran layarnya lebih kecil, Fragment A dan B dapat dipisah.

![](https://github.com/Danboru/Dicoding_Lesson3/blob/master/images/image1.png?raw=true)


#Demo App
![](https://github.com/Danboru/Dicoding_Lesson3/blob/master/images/Lesson3.gif?raw=true)
