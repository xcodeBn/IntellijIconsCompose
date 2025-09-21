package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckedSelected: ImageVector
    get() {
        if (_CheckedSelected != null) return _CheckedSelected!!

        _CheckedSelected = ImageVector.Builder(
            name = "CheckedSelected",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 11f)
                lineTo(5f, 11f)
                lineTo(1f, 4f)
                lineTo(2f, 4f)
                lineTo(5f, 8f)
                lineTo(10f, 1f)
                lineTo(11f, 2f)
                lineTo(6f, 11f)
                lineTo(5f, 11f)
                close()
            }
        }.build()

        return _CheckedSelected!!
    }

private var _CheckedSelected: ImageVector? = null

