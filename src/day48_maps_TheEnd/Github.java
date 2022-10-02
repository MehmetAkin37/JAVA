package day48_maps_TheEnd;

public class Github {

    /*-------Komutlar
    git --version
    git config --       global user.email "email_adresiniz"
    git config --       global user.name "isminiz"
    git config --       global -l
    git init
    git status
    git add .
    git status
    git restore [dosya]--          tek bir dosyayi iptal eder
    git restore . --               tum dosyalari iptal eder
    git restore --stage  [dosya] --      stage deki tek bir dosyayi iptal eder
    git restore --stage .  --            stage deki  --tum dosyalari iptal eder
    git reset --hard hashcode ---    work degisikleri iptal eder , stage i bosaltir
    git diff -->              Working space deki değişikliği gösterir
    git diff --staged -->     Staging Area daki değ işiklikleri gösterir
    git commit -m "first commit"
    git show "hashcode" -->    Versiyondaki değişiklikleri gösterir
    git log    -->    uzunca hashcode lari veriyor
    git log --oneline -->
    git checkout hashcode .  --> bizi bu versiyona goturur
    git branch --> mevcut branch i gosterir
    git branch brnchismi --> yeni branch olusturur
    git checkout branchismi --> o branche gecer
    git merge branchismi --> iki branchi birlestirir
    git remote add origin https://github.com/techproed2020/Git_...
    git push -u origin main
    git branch -d branchisim --> branch i siler


         GIT teki kisim:
    1) git --version --> biligisayarimizdaki git uygulamanin olup olmadigini
     ve kacinci version yuklu oldugunu ogreniyoruz
     2) localimizdeki version kontrol sistemini remuve dakiyle iliskilendirmek
      icin asagdaki komutlari kullaniyoruz:
        - git config --global user.name "Isim Soyisim"     kullanicinin github'taki kullanici adi
        - git config --global user.email "kullanicinin github taki email adresi"
        - git config --global color.ui true --->   reklendirme icin kullaniyoruz opsiyoneldir.
        Not: git config --system ... paremetrelerini kullanidigimizda
        tum kullanicilar ve tum raporlar uzerinde etkili olur. Ama bu cok tevsiye edilmez
        daha cok Tim lead bu paremetreleri kullanir.
        git config --local  ...--->   paremetresi ise sadece gecerli repo uzerinde etkili olur.
      3)Repository(Depo) : Version kontrol ve birlikte calisma altyapisini ayri tutmak
        istedigimiz her bir bagimsiz yapiya REPOSITORY denir.
        Genellikle her bir proje icin ayri bir repository tanimlanir
      4) git init --->   Local bilgisayarimizda bir projeyi version sistemine alabilmek
      icin git init komutu kullanilir. bu komut kullanilinca proje klasorunde   .git
      klasoru olusturulur. Bu, local repomuzu saklayacaktir.
       Local repo olusturmak icin yani .git ile klasorumuzun icindeki dosyalari iliskilendirmek icin kullanilir
       5) git add .  --> Working space'den (yani yerel) dosyalarimi staging area'ya
              (yani commitlemek icin beklenen yer) gonderilir.
        6) git status --> Working space'deki ve staging area 'daki durumu gosterir
        7) git commit -m"mesaj" ---> staging area dan commt storra dosyalarimi gondermek icin kullanilir
               ( commit yani versiyon yani surum olusturmus olurum)
        8) gir push ---> Lokalimizde olusturulan commitleri uzak repo'ya(yani remote - GitHub) gondermek icin kullandigimiz kod
               Yalniz git push  komutunu direk kullanmak istersek 1 kez
                          git remote add origin adress(github)taki email adresimiz-
                          git pus -u origin master   (bizim brancimizin adi)
                 Not: Yukardaki  iki komutu ilk sefer icin kullanilir daha sonra ikinci commit'ler icin sadece
                 git push kullaniriz
        9)  git log --oneline ---> Commitlerimdeki yani versiyonlarimdaki durumu gosterir
                        bieze versionlarimizin hash kodlarimizin ilk 7 karekterini veriyor.
         10)  git branch isim ===> yeni bir branch( dal ) olusturmus oluyoruz. Sebebi Projenin ana yapisana dokunmadan
                 proje uzerinde calismak icin olusturulur.
                 git branch ===> branch listesini bize verir.
                 git checkout isim ===> hangi branch'e gecmek istiysak o branchen ismini yaziyoruz
                 git status ===> branchlerde herhangi bir degisiklik olup olmadigini bize gosterir.
         11) git merge branch ismi===> hangi brench'te isek ve onu diger brench ile esitlemek istiyorsa bu komutu kullaniyoruz
         12) git stash ===> Working spacede ve stating area daki degisiklikleri gecici olarak hafizaya alir ve bolgekeri temizler
        13) git stash pop ===> Hafizaya alinan degisiklikleri geri getirmek icin kullanilir.
        14) git clone  + github daki repository adresi === > Githubdaki (remuve) daki bir repoyu lokale indirmek icinkullanilir
        15) .gitignore ====> remote gondermek istemedigimiz klasorleri gizlemek icin
            -  .idea
            -  *.iml  ===> .iml olan herseyi gizle diyoruz
            -  file==> save all deyip cikis yapiyoruz
        16) conflict ===> cod cakismalarina denir. Farkli devoloperlarin ayni satirlarrda kod yazip
            merge yaptigi sirada ortaya cikan cakismalardir.
            hatayi duzeltmek icin istedigimiz kod satirini silebiliriz ve her ikisinide kalmasini istiyorsak da olur.

    Conflict' in ornek sekli
    <<<<<<<<<<< HEAD
            System.out.println("Gitignore Deneme 2")
    ============
            System.out.println("Gitignore Deneme Branch")
    >>>>>>>>>>> mehmet
           - hatayi duzeltikten sonra ;
           git add .
           git commit -m"mesaj" yaparak conflict duzelmis oluyor.
           en son branch leri esitliyoruz.
        **************

*/
}