package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InformationdialogDark: ImageVector
    get() {
        if (_InformationdialogDark != null) return _InformationdialogDark!!

        _InformationdialogDark = ImageVector.Builder(
            name = "InformationdialogDark",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3592C4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 30f)
                curveTo(8.27f, 30.00f, 2.00f, 23.73f, 2.00f, 16.00f)
                curveTo(2.00f, 8.27f, 8.27f, 2.00f, 16.00f, 2.00f)
                curveTo(23.73f, 2.00f, 30.00f, 8.27f, 30.00f, 16.00f)
                curveTo(30.00f, 23.73f, 23.73f, 30.00f, 16.00f, 30.00f)
                close()
                moveTo(14f, 7f)
                lineTo(14f, 18f)
                lineTo(18f, 18f)
                lineTo(18f, 7f)
                lineTo(14f, 7f)
                close()
                moveTo(14f, 21f)
                lineTo(14f, 25f)
                lineTo(18f, 25f)
                lineTo(18f, 21f)
                lineTo(14f, 21f)
                close()
            }
        }.build()

        return _InformationdialogDark!!
    }

private var _InformationdialogDark: ImageVector? = null

