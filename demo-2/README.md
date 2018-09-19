# Demo 2

Start your first OpenNMS Horizon service stack with Docker Compose.

```
# Start the service stack in background
docker-compose up -d
```

```
# Show status and healtcheck
docker-compose ps

# Stop container and remove just container images, keep volumes
docker-compose down

# Stop container and delete also volumes
docker-compose down -v

# Stop container and keep container images
docker-compose stop
```

Configuration files are persisted on the local file system in `opennms-etc`.
