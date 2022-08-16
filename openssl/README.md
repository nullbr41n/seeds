# CheatSheet

#### Display diagnostic information of TLS/SSL connection.

`openssl s_client -connect www.google.com:443`

#### Display `subject`, `issuer`, `dates` for given certificate or chains.

`awk -v cmd='openssl x509  -subject -issuer -dates -noout' '/BEGIN/{close(cmd)};{print | cmd}'` < MY_Cert_chain.crt
