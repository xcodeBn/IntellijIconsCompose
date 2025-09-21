package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningdialogDark: ImageVector
    get() {
        if (_WarningdialogDark != null) return _WarningdialogDark!!

        _WarningdialogDark = ImageVector.Builder(
            name = "WarningdialogDark",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF0A732)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 2f)
                lineTo(31f, 28f)
                lineTo(1f, 28f)
                lineTo(16f, 2f)
                close()
                moveTo(18f, 25f)
                lineTo(18f, 21f)
                lineTo(14f, 21f)
                lineTo(14f, 25f)
                lineTo(18f, 25f)
                close()
                moveTo(18f, 18f)
                lineTo(18f, 10f)
                lineTo(14f, 10f)
                lineTo(14f, 18f)
                lineTo(18f, 18f)
                close()
            }
        }.build()

        return _WarningdialogDark!!
    }

private var _WarningdialogDark: ImageVector? = null

