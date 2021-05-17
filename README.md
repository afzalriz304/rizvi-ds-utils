[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.afzalriz304/rizvi-ds-utils/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.afzalriz304/rizvi-ds-utils)

Steps to upload repo on maven central

1. Goto Apache Maven -
https://maven.apache.org/repository/guide-central-repository-upload.html
    
    i. Select hosting
    
    ii.The easiest way to upload another project is to use the 
    Open Source Software Repository Hosting (OSSRH) 
    https://central.sonatype.org/publish/publish-guide/, 
    which is an approved repository provided by Sonatype for any OSS Project that want to get their artifacts into the Central Repository.
2. Create a Ticket for publishing repo.

3. Edit Pom.xml as required details , edit setting.xml in .m2 folder 
publish gpg passphrase
 
<code>gpg --keyserver hkp://keys.openpgp.org --send-keys your_public_key</code>
  
[https://www.youtube.com/watch?v=bxP9IuJbcDQ][video reference]

[]: https://www.youtube.com/watch?v=bxP9IuJbcDQ