package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Movetorightbottom: ImageVector
    get() {
        if (_Movetorightbottom != null) return _Movetorightbottom!!

        _Movetorightbottom = ImageVector.Builder(
            name = "Movetorightbottom",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 10f)
                lineTo(3f, 13f)
                lineTo(13f, 13f)
                lineTo(13f, 3f)
                lineTo(3f, 3f)
                lineTo(3f, 10f)
                lineTo(3f, 13f)
                lineTo(6f, 13f)
                lineTo(6f, 7f)
                lineTo(3f, 7f)
                lineTo(3f, 10f)
                close()
                moveTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 2f)
                close()
            }
        }.build()

        return _Movetorightbottom!!
    }

private var _Movetorightbottom: ImageVector? = null

