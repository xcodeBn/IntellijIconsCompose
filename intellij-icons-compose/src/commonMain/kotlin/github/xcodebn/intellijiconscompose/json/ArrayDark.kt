package github.xcodebn.intellijiconscompose.json

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrayDark: ImageVector
    get() {
        if (_ArrayDark != null) return _ArrayDark!!

        _ArrayDark = ImageVector.Builder(
            name = "ArrayDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 13f)
                lineTo(2f, 3f)
                lineTo(6f, 3f)
                lineTo(6f, 4f)
                lineTo(4f, 4f)
                lineTo(4f, 12f)
                lineTo(6f, 12f)
                lineTo(6f, 13f)
                lineTo(2f, 13f)
                close()
                moveTo(10f, 13f)
                lineTo(10f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 4f)
                lineTo(10f, 4f)
                lineTo(10f, 3f)
                lineTo(14f, 3f)
                lineTo(14f, 13f)
                lineTo(10f, 13f)
                close()
            }
        }.build()

        return _ArrayDark!!
    }

private var _ArrayDark: ImageVector? = null

