package github.xcodebn.intellijiconscompose.toolbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Locale: ImageVector
    get() {
        if (_Locale != null) return _Locale!!

        _Locale = ImageVector.Builder(
            name = "Locale",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(12f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                curveTo(10.01f, 12.90f, 9.55f, 13.33f, 9.00f, 13.61f)
                curveTo(8.45f, 13.90f, 7.84f, 14.03f, 7.22f, 14.00f)
                curveTo(5.01f, 14.00f, 4.00f, 12.80f, 4.00f, 11.39f)
                curveTo(4.00f, 9.70f, 5.10f, 8.72f, 7.34f, 8.45f)
                lineTo(10f, 8f)
                curveTo(10.38f, 6.45f, 9.61f, 5.77f, 8.29f, 5.77f)
                curveTo(7.10f, 5.76f, 5.94f, 6.15f, 4.99f, 6.88f)
                verticalLineTo(5f)
                curveTo(6.04f, 4.81f, 7.23f, 4.52f, 8.43f, 4.55f)
                curveTo(10.82f, 4.55f, 12.00f, 5.67f, 12.00f, 7.92f)
                verticalLineTo(14f)
                close()
                moveTo(6f, 3f)
                curveTo(5.75f, 2.99f, 5.50f, 2.88f, 5.31f, 2.69f)
                curveTo(5.12f, 2.51f, 5.01f, 2.25f, 5.01f, 1.99f)
                curveTo(5.01f, 1.86f, 5.03f, 1.73f, 5.08f, 1.61f)
                curveTo(5.13f, 1.49f, 5.20f, 1.38f, 5.29f, 1.29f)
                curveTo(5.38f, 1.20f, 5.49f, 1.12f, 5.61f, 1.07f)
                curveTo(5.73f, 1.02f, 5.86f, 1.00f, 5.99f, 1.00f)
                curveTo(6.12f, 1.00f, 6.25f, 1.02f, 6.37f, 1.07f)
                curveTo(6.49f, 1.12f, 6.60f, 1.19f, 6.69f, 1.29f)
                curveTo(6.78f, 1.38f, 6.86f, 1.49f, 6.91f, 1.61f)
                curveTo(6.96f, 1.73f, 6.98f, 1.86f, 6.99f, 1.99f)
                curveTo(6.99f, 2.12f, 6.96f, 2.25f, 6.92f, 2.37f)
                curveTo(6.87f, 2.49f, 6.80f, 2.60f, 6.71f, 2.69f)
                curveTo(6.62f, 2.78f, 6.51f, 2.86f, 6.39f, 2.91f)
                curveTo(6.27f, 2.96f, 6.14f, 2.99f, 6.01f, 2.99f)
                verticalLineTo(3f)
                close()
                moveTo(10f, 9f)
                lineTo(8f, 10f)
                curveTo(6.62f, 9.69f, 5.66f, 9.97f, 5.66f, 11.28f)
                curveTo(5.66f, 12.28f, 6.58f, 12.78f, 7.60f, 12.78f)
                curveTo(7.96f, 12.80f, 8.32f, 12.75f, 8.66f, 12.63f)
                curveTo(9.00f, 12.50f, 9.31f, 12.31f, 9.57f, 12.06f)
                curveTo(9.83f, 11.81f, 10.04f, 11.51f, 10.18f, 11.17f)
                curveTo(10.31f, 10.84f, 10.38f, 10.48f, 10.38f, 10.12f)
                verticalLineTo(9f)
                close()
                moveTo(10f, 3f)
                curveTo(9.87f, 2.99f, 9.74f, 2.96f, 9.62f, 2.91f)
                curveTo(9.50f, 2.86f, 9.39f, 2.79f, 9.30f, 2.69f)
                curveTo(9.21f, 2.60f, 9.14f, 2.49f, 9.09f, 2.37f)
                curveTo(9.05f, 2.25f, 9.03f, 2.12f, 9.03f, 1.99f)
                curveTo(9.03f, 1.86f, 9.05f, 1.73f, 9.09f, 1.61f)
                curveTo(9.14f, 1.49f, 9.21f, 1.38f, 9.30f, 1.29f)
                curveTo(9.38f, 1.20f, 9.49f, 1.13f, 9.61f, 1.08f)
                curveTo(9.73f, 1.03f, 9.85f, 1.00f, 9.98f, 1.00f)
                curveTo(10.11f, 1.00f, 10.24f, 1.02f, 10.36f, 1.07f)
                curveTo(10.48f, 1.12f, 10.59f, 1.19f, 10.68f, 1.29f)
                curveTo(10.78f, 1.38f, 10.85f, 1.49f, 10.90f, 1.61f)
                curveTo(10.95f, 1.73f, 10.97f, 1.86f, 10.97f, 1.99f)
                curveTo(10.97f, 2.12f, 10.95f, 2.25f, 10.91f, 2.37f)
                curveTo(10.86f, 2.49f, 10.79f, 2.60f, 10.70f, 2.69f)
                curveTo(10.61f, 2.79f, 10.50f, 2.86f, 10.38f, 2.91f)
                curveTo(10.26f, 2.96f, 10.13f, 2.99f, 10.00f, 2.99f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _Locale!!
    }

private var _Locale: ImageVector? = null

