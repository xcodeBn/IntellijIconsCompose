package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Findandshowprevmatches: ImageVector
    get() {
        if (_Findandshowprevmatches != null) return _Findandshowprevmatches!!

        _Findandshowprevmatches = ImageVector.Builder(
            name = "Findandshowprevmatches",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 4f)
                lineTo(9f, 8f)
                lineTo(5f, 12f)
                lineTo(6f, 13f)
                lineTo(11f, 8f)
                lineTo(6f, 3f)
                close()
            }
        }.build()

        return _Findandshowprevmatches!!
    }

private var _Findandshowprevmatches: ImageVector? = null

