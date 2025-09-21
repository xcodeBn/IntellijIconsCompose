package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Settings: ImageVector
    get() {
        if (_Settings != null) return _Settings!!

        _Settings = ImageVector.Builder(
            name = "Settings",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 8f)
                curveTo(4.94f, 6.98f, 4.00f, 5.60f, 4.00f, 4.00f)
                curveTo(4.00f, 2.32f, 5.03f, 0.88f, 6.50f, 0.29f)
                lineTo(6f, 4f)
                lineTo(10f, 4f)
                lineTo(10f, 0f)
                curveTo(10.97f, 0.88f, 12.00f, 2.32f, 12.00f, 4.00f)
                curveTo(12.00f, 5.60f, 11.06f, 6.98f, 9.70f, 7.62f)
                lineTo(10f, 16f)
                lineTo(6f, 16f)
                lineTo(6f, 8f)
                close()
            }
        }.build()

        return _Settings!!
    }

private var _Settings: ImageVector? = null

