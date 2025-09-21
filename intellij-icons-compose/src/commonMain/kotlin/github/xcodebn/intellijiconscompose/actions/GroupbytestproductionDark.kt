package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GroupbytestproductionDark: ImageVector
    get() {
        if (_GroupbytestproductionDark != null) return _GroupbytestproductionDark!!

        _GroupbytestproductionDark = ImageVector.Builder(
            name = "GroupbytestproductionDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(12f, 8f)
                lineTo(9f, 12f)
                lineTo(9f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(4f, 8f)
                lineTo(7f, 4f)
                lineTo(7f, 12f)
                close()
            }
        }.build()

        return _GroupbytestproductionDark!!
    }

private var _GroupbytestproductionDark: ImageVector? = null

