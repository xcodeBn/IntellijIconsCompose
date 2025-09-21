package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Groupbytestproduction: ImageVector
    get() {
        if (_Groupbytestproduction != null) return _Groupbytestproduction!!

        _Groupbytestproduction = ImageVector.Builder(
            name = "Groupbytestproduction",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(10f, 4f)
                lineTo(6f, 7f)
                lineTo(6f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(0f, 4f)
                lineTo(4f, 0f)
                lineTo(4f, 7f)
                close()
            }
        }.build()

        return _Groupbytestproduction!!
    }

private var _Groupbytestproduction: ImageVector? = null

