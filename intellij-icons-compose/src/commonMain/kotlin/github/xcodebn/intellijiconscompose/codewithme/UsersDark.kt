package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UsersDark: ImageVector
    get() {
        if (_UsersDark != null) return _UsersDark!!

        _UsersDark = ImageVector.Builder(
            name = "UsersDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(12f, 8f)
                curveTo(12.70f, 8.50f, 13.59f, 7.62f, 13.59f, 6.54f)
                curveTo(13.59f, 5.45f, 12.70f, 4.57f, 11.60f, 4.57f)
                curveTo(10.50f, 4.57f, 9.60f, 5.45f, 9.60f, 6.54f)
                curveTo(9.60f, 7.62f, 10.50f, 8.50f, 11.60f, 8.50f)
                close()
                moveTo(6f, 8f)
                curveTo(6.93f, 7.71f, 7.99f, 6.66f, 7.99f, 5.36f)
                curveTo(7.99f, 4.05f, 6.93f, 3.00f, 5.60f, 3.00f)
                curveTo(4.27f, 3.00f, 3.20f, 4.05f, 3.20f, 5.36f)
                curveTo(3.20f, 6.66f, 4.27f, 7.71f, 5.60f, 7.71f)
                close()
                moveTo(12f, 10f)
                curveTo(10.14f, 10.07f, 7.20f, 10.79f, 7.20f, 12.23f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                curveTo(16.00f, 10.79f, 13.06f, 10.07f, 11.60f, 10.07f)
                close()
                moveTo(6f, 9f)
                curveTo(3.74f, 9.29f, 0.00f, 10.21f, 0.00f, 12.04f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                curveTo(5.60f, 11.56f, 5.86f, 10.39f, 7.50f, 9.51f)
                curveTo(6.80f, 9.36f, 6.13f, 9.29f, 5.60f, 9.29f)
                close()
            }
        }.build()

        return _UsersDark!!
    }

private var _UsersDark: ImageVector? = null

