set JAVA_HOME=.\jdk
set JC_HOME=.\java_card_kit-2_2_1
set JAVA_SOURCE_ROOT=.\src

:: following call to converter must be on one line !
%JC_HOME%\bin\converter -classdir %JAVA_SOURCE_ROOT% -noverify -i -out EXP JCA CAP -exportpath %JC_HOME%\api_export_files -applet 0xD2:0x76:0x00:0x01:0x18:0x00:0x03:0xFF:0x34:0x00:0x7E:0x89:0xAA:0x00:0x7F:0x09 com.gieseckedevrient.javacard.securestoragetester.SecureStorageApplet com.gieseckedevrient.javacard.securestoragetester 0xD2:0x76:0x00:0x01:0x18:0x00:0x03:0xFF:0x34:0x00:0x7E:0x89:0xAA:0x00:0x7F:0x00 1.0



