package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolbarterminated: ImageVector
    get() {
        if (_Toolbarterminated != null) return _Toolbarterminated!!

        _Toolbarterminated = ImageVector.Builder(
            name = "Toolbarterminated",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 14f)
                curveTo(4.41f, 14.50f, 1.50f, 11.59f, 1.50f, 8.00f)
                curveTo(1.50f, 4.41f, 4.41f, 1.50f, 8.00f, 1.50f)
                curveTo(11.59f, 1.50f, 14.50f, 4.41f, 14.50f, 8.00f)
                curveTo(14.50f, 11.59f, 11.59f, 14.50f, 8.00f, 14.50f)
                close()
                moveTo(4f, 7f)
                lineTo(4f, 9f)
                lineTo(12f, 9f)
                lineTo(12f, 7f)
                lineTo(4f, 7f)
                close()
            }
        }.build()

        return _Toolbarterminated!!
    }

private var _Toolbarterminated: ImageVector? = null

