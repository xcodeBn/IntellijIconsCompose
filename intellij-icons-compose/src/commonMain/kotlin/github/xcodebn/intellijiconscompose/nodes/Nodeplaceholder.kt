package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Nodeplaceholder: ImageVector
    get() {
        if (_Nodeplaceholder != null) return _Nodeplaceholder!!

        _Nodeplaceholder = ImageVector.Builder(
            name = "Nodeplaceholder",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 7f)
                lineTo(10f, 7f)
                lineTo(10f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 10f)
                lineTo(7f, 10f)
                lineTo(7f, 9f)
                lineTo(6f, 9f)
                lineTo(6f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 6f)
                lineTo(9f, 6f)
                lineTo(9f, 7f)
                close()
            }
        }.build()

        return _Nodeplaceholder!!
    }

private var _Nodeplaceholder: ImageVector? = null

