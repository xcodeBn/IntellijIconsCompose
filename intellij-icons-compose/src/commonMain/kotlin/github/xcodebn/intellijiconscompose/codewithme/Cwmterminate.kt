package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cwmterminate: ImageVector
    get() {
        if (_Cwmterminate != null) return _Cwmterminate!!

        _Cwmterminate = ImageVector.Builder(
            name = "Cwmterminate",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFDB5860)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 9f)
                lineTo(12f, 6f)
                lineTo(9f, 8f)
                lineTo(13f, 12f)
                close()
            }
        }.build()

        return _Cwmterminate!!
    }

private var _Cwmterminate: ImageVector? = null

