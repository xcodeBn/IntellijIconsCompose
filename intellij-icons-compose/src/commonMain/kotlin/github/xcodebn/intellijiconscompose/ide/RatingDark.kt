package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RatingDark: ImageVector
    get() {
        if (_RatingDark != null) return _RatingDark!!

        _RatingDark = ImageVector.Builder(
            name = "RatingDark",
            defaultWidth = 11.0.dp,
            defaultHeight = 11.0.dp,
            viewportWidth = 11.0f,
            viewportHeight = 11.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3592C4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 9f)
                lineTo(2f, 11f)
                lineTo(3f, 7f)
                lineTo(0f, 4f)
                lineTo(4f, 4f)
                lineTo(6f, 0f)
                lineTo(7f, 4f)
                lineTo(11f, 4f)
                lineTo(8f, 7f)
                lineTo(9f, 11f)
                close()
            }
        }.build()

        return _RatingDark!!
    }

private var _RatingDark: ImageVector? = null

