How to: 
- Find my gpg key
- import public gpg
- sign file using keybase pgp
- encrypt file


## How to:

1. Find my existing gpg keys

`gpg --list-secret-keys --keyid-format=long`

2. Import public key to your keyring

`cat pub.pgp | gpg --import`

3. Export the PGP public key out of Keybase and into GPG.
```
keybase pgp export | gpg --import                                                                                                                                             ✔ 
gpg: key <Key_ID>: "Null Brain <nullbr41n@blah.com>" is imported
gpg: Total number processed: 1
gpg:              imported: 1
```

4. [Invoking GPG-AGENT](https://www.gnupg.org/documentation/manuals/gnupg/Invoking-GPG_002dAGENT.html)
```
export GPG_TTY=$(tty)                                                                                                                                            2 ↵ | took 18s 
```

NOTE: if you have multiple keys, use keybase pgp list to see the keys and their key IDs, then add -q <keyID>.

5. Import key from keybase
```
keybase pgp export --secret | gpg --import --allow-secret-key-import                                                                                                          ✔ 
gpg: key <Key_ID>: "Null Brain <nullbr41n@blah.com>" not imported
gpg: key <Key_ID>: secret key imported
gpg: Total number processed: 1
gpg:              unchanged: 1
gpg:       secret keys read: 1
gpg:   secret keys imported: 1
```

6. Verify keys

`gpg --list-keys`

7. Encrypt file

```
gpg --output blah.ext --encrypt --recipient <email_from_list_keys> 20211130_081559__01__01.ext
```
  
8. Find my public key to share.

`gpg --output public.pgp --armor --export <email>`
