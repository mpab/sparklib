pushd sparklib
rmdir /s /q target
call sbt package
popd

pushd sparkapp
rmdir /s /q target
call sbt package
popd
