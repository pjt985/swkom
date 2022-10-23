database-docker:
	docker run -p 5432:5432 --name some-postgis -e POSTGRES_PASSWORD=admin -d postgis/postgis
	# user: postgres
	# pass: admin
