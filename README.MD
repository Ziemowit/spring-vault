1. Run the vault via attached docker
2. Insert the secret into vault

vault kv put -mount=secret person firstName=Ziemowit lastName=Stolarczyk age=34

3. Run the application with given parameters
--spring.cloud.vault.token=1234 --spring.cloud.vault.scheme=http

