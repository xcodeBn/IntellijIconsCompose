package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbObsoleteDark: ImageVector
    get() {
        if (_DbObsoleteDark != null) return _DbObsoleteDark!!

        _DbObsoleteDark = ImageVector.Builder(
            name = "DbObsoleteDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 12f)
                curveTo(2.96f, 11.50f, 0.50f, 9.04f, 0.50f, 6.00f)
                curveTo(0.50f, 2.96f, 2.96f, 0.50f, 6.00f, 0.50f)
                curveTo(9.04f, 0.50f, 11.50f, 2.96f, 11.50f, 6.00f)
                curveTo(11.50f, 9.04f, 9.04f, 11.50f, 6.00f, 11.50f)
                close()
                moveTo(5f, 2f)
                lineTo(5f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 2f)
                lineTo(5f, 2f)
                close()
                moveTo(5f, 8f)
                lineTo(5f, 10f)
                lineTo(7f, 10f)
                lineTo(7f, 8f)
                lineTo(5f, 8f)
                close()
            }
        }.build()

        return _DbObsoleteDark!!
    }

private var _DbObsoleteDark: ImageVector? = null

