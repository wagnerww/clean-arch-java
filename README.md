### Criando um projeto parent novo com o Maven:

    mvn archetype:generate -DgroupId=com.wagnerww.cleanarch -DartifactId=clean-arch

- Adicionar a tag abaixo para o compilador entender que é um parent:

      <packaging>pom</packaging>

### Criando os sub-modulos:
  
    mvn archetype:generate -DgroupId=com.wagnerww.cleanarch.domain -DartifactId=domain
    mvn archetype:generate -DgroupId=com.wagnerww.cleanarch.application -DartifactId=application
    mvn archetype:generate -DgroupId=com.wagnerww.cleanarch.infrastructure -DartifactId=infrastructure


### TESTES:
- Adicione a dependencia do jupiter e retire a do junit 4(depreciada):
    
      <dependencies>
        <dependency>
          <groupId>org.junit.jupiter</groupId>
          <artifactId>junit-jupiter-engine</artifactId>
          <version>5.5.2</version>
          <scope>test</scope>
        </dependency>
      </dependencies>

- Plugin de testes, parte de build adicione o plugin do surefire:
      
      <build>
        <plugins>
          <plugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-surefire-plugin</artifactId>
              <version>3.0.0-M3</version>
          </plugin>
        </plugins>

- Fazendo os modulos se enxergarem(No pom adicione o modulo dependente):

      <dependency>
        <groupId>com.wagnerww.cleanarch.domain</groupId>
        <artifactId>domain</artifactId>
        <version>1.0-SNAPSHOT</version>
      </dependency>

