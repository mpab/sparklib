pushd sparklib
rmdir /s /q target
call sbt package
popd

pushd sparkapp
rmdir /s /q target
call sbt package
popd

rmdir /s /q packages
mkdir packages

copy sparkapp\target\scala-2.11\*.jar packages
copy sparklib\target\scala_2.11\*.jar packages