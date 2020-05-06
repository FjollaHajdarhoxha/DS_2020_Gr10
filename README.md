# DS_2020_Gr10
Projekti per lenden "Siguria e te dhenave".
Faza e pare.

Punim nga Gr:10 nga studentet:Rina Lutolli,
                              Fjolla Hajdarhoxha,
                              Drenushë Pirraku.

Nen mentorimin e Prof. Arbnor Halili.


Komanda Caesar 

Paraqet algoritem simetrik per enkriptimin dhe dekriptimin e te dhenave.
Punon ne baze te zevendesimit te cdo shkronje te plaintekstit(teksti per ekriptim) me nje shkronje tjeter 
ne menyre qe cdo shkronje e alfabetit zhvendoset per nje numer qe ne kete rast paraqet celsin e algoritmit.

Permbahet nga dy nenkomanda:ekriptimi dhe dekriptimi.
Keto ekzekutohen me ane te argumenteve si ne foto.
(Shiko ne file-n e shembujve te ekzekutimit)

Komanda Bruteforce

Ekzekutohet ne ate menyre qe provon te gjithe qelsat e mundeshem,dmth paraqet te gjitha dekriptimet e mundshme 
te cyphertext-it
Ekzekutohet me ane te argumenteve si ne foto.
(Shiko ne file-n e shembujve te ekzekutimit)
(caesar.png)


Komanda Case 
Paraqet algoritem per manipulim me tekst.Ka disa nenkomanda te cilat kryejn veprime te ndryshme.
Nenkomanda Lower:
Ben konvertimin e cdo lloji te tekstit ne tekst me shkronja te vogla.
Nenkomanda Upper:
Ben konvertimin e cdo lloji te tekstit ne tekst me shkronja te medhaja.
Nenkomanda Capitalize:
Ben kapitalizimin e fjaleve(cdo fjale shkronja e pare i behet e madhe)
Nenkomanda Inverse:
Ben ndryshimin e formatit te shkronjave(shkronjat e medha ne te vogla,shkronja e vogla ne te medha)
Nenkomanda Alternating:
Ben formatin e fjalise ne ate menyre qe fjala perbehet vazhdimisht nga nje shkronje e madhe nje e vogel.
Keto ekzekutohen me ane te argumenteve si ne foto.
(Shiko ne file-n e shembujve te ekzekutimit).
(Case.png)

Komanda RailFence 

Paraqet algoritem simetrik per enkriptimin dhe dekriptimin e te dhenave.
Punon ne baze te organizimit te plaintextit ne shirita, te cilat lexohen pastaj djathtas majtas.
Numri i shiritave paraqet celesin e algoritmit.
Permbahet nga dy nenkomanda:ekriptimi dhe dekriptimi.
Keto ekzekutohen me ane te argumenteve si ne foto.
(Shiko ne file-n e shembujve te ekzekutimit)
(RailFence.png)

Referencat:
Geeksforgeeks.org, https://www.iamcseian.blogspot.com/,
http://network-security-lab.weebly.com/uploads/7/8/6/0/7860259/ex_1_caesar_cipher.pdf?fbclid=IwAR2JTXsTQLV1YAjf3qv3fGYpulq9yWYFcu4pOJ579M-xmxmJHXVtGmkMnb4, dhe ushtrimet nga Prof. Arbnor Halili

FIEK 2020



Faza e dyte 

Komanda create-user

Krijon një çift të publik/privat të RSA me emrat <name>.xml dhe <name>.pub.xml brenda
direktoriumit të çelësave keys.
Sintaksa: ds create-user <name>
  
Komanda delete-user

I largon të gjithë çelësat ekzistues të shfrytëzuesit.
Sintaksa: ds delete-user <name>
  
Komanda export-key

Eksporton çelësin publik ose privat të shfrytëzuesit nga direktoriumi i çelësave.
Sintaksa: ds export-key <public|private> <name> [file]
          <public|private> - përcakton llojin e çelësit që eksportohet.
           <name> - përcakton çelësin e cilit shfrytëzues të eksportohet.
           [file] - përcakton shtegun e fajllit se ku do të ruhet çelësi i eksportuar.
      
Komanda import-key

Importon çelësin publik ose privat të shfrytëzuesit nga shtegu i dhënë dhe e vendos në direktoriumin
e çelësave.
Sintaksa: ds import-key <name> <path>
          <name> - përcakton emrin e çelësit që do të ruhet në direktoriumin keys.
          <path> - përcakton shtegun e çelësit që do të importohet.
            
Komanda write-message

E shkruan një mesazh të enkriptuar të dedikuar për një shfrytëzues.
Sintaksa: ds write-message  <message> <name> 
           <name> - paraqet marrësin e mesazhit (çelësin publik).
           <message> - paraqet mesazhin që do të enkriptohet.
             
 Komanda read-message
 
E dekripton dhe e shfaq në console mesazhin e enkriptuar.
           Sintaksa: ds read-message <encrypted-message> <name>
