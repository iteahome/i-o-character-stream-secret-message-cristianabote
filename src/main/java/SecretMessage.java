import java.io.*;

public class SecretMessage {
    public static void main(String[] args ) throws IOException {
        FileReader inputStream=null;
        FileWriter outputStream=null;
        try{
            inputStream= new FileReader("secret.txt");
            outputStream= new FileWriter("output.txt");
            int character;
            while ((character=inputStream.read())!=-1)
                if(Character.isUpperCase((char)character))
                    if((char)character == 'X')
                        outputStream.write(" ");
                    else
                        outputStream.write(character);
        }
        finally {
            if (inputStream!=null)
                inputStream.close();
            if(outputStream!=null)
                outputStream.close();
        }
    }
}

/*
By using CharacterStream, please discover the secret message from the given "secret.txt" file considering the following instructions:

Take into consideration only capital letters from the input text
Consider capital X as space between words
The secret message need to be readed from a file
secret.txt

 tHe quick brown fox jumps over the lazy dog.

 thE quick brown fox jumps over the Lazy dog.

the quick brown fox jumPs over the lazy dog.

the quick brown foX juMps over the lazy dog.

thE quick brown fox jumps over the lazy dog

Output

HELP ME
 */