pushd sparklib
rmdir /s /q target
REM call sbt package
call sbt publishLocal
popd

pushd sparkapp
rmdir /s /q target
call sbt package
popd
