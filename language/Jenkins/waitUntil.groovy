//Jenkins groovy example to run waitUntil some file exists.

timeout(5) {
  waitUntil {
  fileExists 'myFile.yaml'
  }
}
