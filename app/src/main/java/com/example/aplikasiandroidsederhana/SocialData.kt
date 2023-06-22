package com.example.aplikasiandroidsederhana

object SocialData {

    private val SocialNames = arrayOf(
        "Youtube",
        "Whatsapp",
        "Instagram",
        "Facebook",
        "Twitter",
        "Line",
        "Linkedin",
        "Tiktok",
        "Pinterest",
        "Telegram",
        "Discord",
    )

    private val SocialBorn = arrayOf(
        "2005 oleh Chad Hurley, Steve Chen, dan Jawed Karim.",
        "2009 oleh Brian Acton dan Jan Koum.",
        "2010 oleh Kevin Systrom dan Mike Krieger.",
        "2004 oleh Mark Zuckerberg.",
        "2006 oleh Jack Dorsey, Biz Stone, dan Evan Williams.",
        "2011 oleh Naver Corporation.",
        "2002 oleh Reid Hoffman",
        "2016 oleh perusahaan Tiongkok, ByteDance",
        "2010 oleh Ben Silbermann, Paul Sciarra, dan Evan Sharp.",
        "2013 oleh Pavel Durov",
        "2015 oleh Jason Citron",
    )

    private val SocialDescs = arrayOf(
        "Youtube merupakan situs web untuk berbagi video. Beberapa orang juga menyebutnya sebagai media sosial berbasis video.  Berbagai macam video  bisa diunggah melalui youtube mulai dari video tutorial, music, video edukasi, film pendek, trailer film, sinetron, video blog, dan lain-lain.",
        "WhatsApp merupakan aplikasi pesan instan yang bisa digunakan melalui smartphone atau laptop. WhatsApp tidak menggunakan pulsa seperti SMS, tetapi menggunakan data internet. Jadi, pada aplikasi ini tidak perlu khawatir mengenai panjang pendeknya karakter tulisan, tidak ada batasan selama data internet memadai. Tidak hanya berkirim pesan seperti teks, pada WhatsApp juga bisa mengirim gambar, video, juga dokumen.",
        "Instagram menjadi media sosial yang digemari di Indonesia terutama kaum muda. Aplikasi berbasis iOS, Android, dan Windows phone ini dapat digunakan penggunanya untuk mengedit, memposting foto, video, ke halaman utama instagram dan jejaring sosial lainnya.",
        "Facebook memiliki fungsi yang beraneka ragam seperti berbagi foto, video, lokasi, maupun kegiatan-kegiatan lain. Facebook juga terus melakukan pembaharuan untuk meningkatkan kenyamanan penggunanya.",
        "Twitter adalah konsep jejaring sosial dan microblogging. Pengguna twitter sudah mencapai lebih dari 500 juta pengguna bersaing dengan facebook. Twitter yang merupakan aplikasi yang praktis dan simple yang memiliki berbagai sistem yang berbeda dengan media sosial lainnya.",
        "Line merupakan aplikasi pesan instan yang memungkinkan pengguna untuk saling berkomunikasi melalui jaringan internet. Hamper sama dengan Whatsapp, Line juga bisa untuk mengirim pesan teks, foto, video, dokumen, dan link.",
        "LinkedIn adalah salah satu media sosial yang berfokus pada jaringan profesional dan bisnis. LinkedIn digunakan untuk memajang keahlian dan pengalaman yang dimiliki seseorang, baik itu karyawan, pengusaha, pengusaha, dosen, hingga mahasiswa. Dengan LinkedIn, seseorang dapat membuat profil profesional dengan menambahkan CV foto, pendidikan, hingga pengalaman-pengalaman lain.",
        "Tiktok merupakan aplikasi yang digunakan untuk merekam, mengedit, dan mengunggahnya ke beberapa social media. Dengan Tiktok, bisa membuat video pendek dengan disertai musik dan tulisan. Konten yang unik, biasanya akan cepat viral.",
        "Pinterest adalah media social virtual pinboard yang memungkinkan penggunanya untuk membuat koleksi foto maupun album.uniknya, pinterest ini bisa pengguna buat dari hasil unggahan sendiri maupun dari kumpulan gambar pengguna lain yang pengguna temukan di pinterest.",
        "Telegram merupakan aplikasi pesan yang memungkinkan pengguna untuk mengirimkan pesan chatting rahasia yang dienkripsi end to end sebagai keamanan tambahan. Telegram bisa digunakan di android, iphone, windows phone juga computer.",
        "Discord adalah platform komunikasi yang memfasilitasi penggunanya untuk saling mengirim percakapan, gambar, audio, video, bahkan berbagi layar. Discord banyak digunakan oleh para gamer sebagai sarana komunikasi yang lebih efektif. Ada banyak fitur yang dimiliki oleh aplikasi satu ini, seperti channel (kanal), streaming, serta panggilan video."
    )

    private val SocialImages = intArrayOf(
        R.drawable.youtube,
        R.drawable.whatsapp,
        R.drawable.instagram,
        R.drawable.facebook,
        R.drawable.twitter,
        R.drawable.line,
        R.drawable.linkedin,
        R.drawable.tik_tok,
        R.drawable.pinterest,
        R.drawable.telegram,
        R.drawable.discord,
    )

    val ListSocial: ArrayList<Social>
        get() {
            val list = arrayListOf<Social>()
            for (pos in SocialNames.indices){
                val social = Social()
                social.name = SocialNames[pos]
                social.desc = SocialDescs[pos]
                social.image = SocialImages[pos]
                social.born = SocialBorn[pos]
                list.add(social)
            }
            return list
        }
}