# Tutorial

1. Buka Halaman Repositori

Buka halaman repositori yang ingin Anda fork di GitHub.
Klik tombol "Fork" di sudut kanan atas halaman untuk menyalin repositori ke akun GitHub Anda.

2. Clone Repositori

Buka terminal atau Git Bash pada komputer Anda.
Ketikkan perintah 

`git clone https://github.com/zhulkhoirr/letsevent`

Tunggu hingga proses cloning selesai. Repositori akan tersalin ke komputer Anda.

3. Buat Perubahan dan Commit

Buka file yang ingin Anda ubah menggunakan editor teks favorit Anda.
Buat perubahan pada file.
Simpan perubahan tersebut.
Kembali ke terminal atau Git Bash.
Ketikkan perintah untuk melihat perubahan apa saja yang terjadi.

`git status`

Ketikkan perintah untuk menambahkan perubahan ke staging area.

`git add *`

Ketikkan perintah 

`git commit -m "pesan commit Anda"`

misalnya **git commit -m "Menambahkan fitur baru pada halaman utama"**, untuk menyimpan perubahan secara permanen pada repositori lokal.

4. Push ke Repositori Jarak Jauh

Buka terminal atau Git Bash pada komputer Anda.
Masuk ke direktori repositori letsevent dengan perintah 

`cd src`, `cd letsevent`

Ketikkan perintah 

`git push`

untuk mengirim perubahan pada repositori lokal ke repositori jarak jauh di akun GitHub Anda.
Buka halaman repositori di akun GitHub Anda.
Klik tombol "New Pull Request" di sudut kanan atas halaman.
Setelah melakukan review pada perubahan Anda, klik tombol "Create Pull Request" untuk mengirim perubahan ke pemilik repositori.
