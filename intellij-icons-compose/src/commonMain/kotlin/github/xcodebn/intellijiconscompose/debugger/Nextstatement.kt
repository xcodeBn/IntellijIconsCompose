package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Nextstatement: ImageVector
    get() {
        if (_Nextstatement != null) return _Nextstatement!!

        _Nextstatement = ImageVector.Builder(
            name = "Nextstatement",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFEDA200)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 6f)
                lineTo(7f, 1f)
                lineTo(6f, 2f)
                lineTo(11f, 7f)
                lineTo(12f, 6f)
                close()
            }
        }.build()

        return _Nextstatement!!
    }

private var _Nextstatement: ImageVector? = null

