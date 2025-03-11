package ro.mpp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConfig {

    private static final Logger logger = LogManager.getLogger(DatabaseConfig.class);
    private static final String CONFIG_FILE = "src/main/resources/config.properties";
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties props = new Properties();
                FileInputStream inputStream = new FileInputStream(CONFIG_FILE);
                props.load(inputStream);
                String dbUrl = props.getProperty("db.url");

                connection = DriverManager.getConnection(dbUrl);
                logger.info("Database connected successfully.");
            } catch (IOException | SQLException e) {
                logger.error("Error while connecting to the database: " + e.getMessage(), e);
            }
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                logger.info("Database connection closed.");
            }
        } catch (SQLException e) {
            logger.error("Error closing connection: " + e.getMessage(), e);
        }
    }
}
