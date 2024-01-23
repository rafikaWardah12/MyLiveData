# MyLiveData
Project ini merupakan hasil implementasi LiveData. Fitur yang ada yaitu countdown timer yang disetting secara hardCode dikarenakan output pada project ini yaitu mengetahui fungsi dari LiveData.

## Implementasi
1. Membuat kelas ViewModel
2. Membuat fitur timer yang datanya akan dikirim ke Activity menggunakan LiveData
3. Implementasi ViewModel ke dalam Activity

## What I Learn
1. MutableLiveData = dapat diubah valuenya
2. Livedata = Read-Only
3. setValue( ) = menetapkan nilai dari LiveData. Misal observer aktif, nilai ini akan dikirim kepada observer dan harus dipanggil dari main thread. Intinya berkerja di main thread
4. postValue( ) = menetapkan nilai yang diberikan. Intinya bekerja di worker thread
5. getValue( ) = mendapatkan nilai dari LiveData
6. postValue( ) = memposting tugas ke main thread untuk menetapkan nilai yang masuk 
8. Menghubungkan MainViewModel dengan MainActivity. Penghubungnya = getElapsedTime pada MainViewModel dan Memanggil fungsi *subscribe* sehingga saat perubahan data otomatis mengubah textView 
